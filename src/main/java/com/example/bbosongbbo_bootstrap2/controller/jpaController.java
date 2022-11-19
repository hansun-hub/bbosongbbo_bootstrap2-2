package com.example.bbosongbbo_bootstrap2.controller;

import com.example.bbosongbbo_bootstrap2.entity.Member;
import com.example.bbosongbbo_bootstrap2.repository.MemberRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.itemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class jpaController {


    /*

    DI_주입
     */
    @Autowired
    private MemberRepository memberRepository;

    /*
    등록버튼을 눌렀을 때
     */
    @RequestMapping(value = "/jpa/bookingList",method = RequestMethod.POST)
    public String insertMember(itemDTO itemDTO, Model model) {

        try{
            //등록처리
            System.out.println(itemDTO.getSchedule_run_date());
            System.out.println(itemDTO.getSchedule_id());
            System.out.println(itemDTO.getShell_num());
            System.out.println(itemDTO.getSchedule_duration());
            System.out.println(itemDTO.getSchedule_repeat());
            System.out.println(itemDTO.getNum());

            //1. DTO 변환 --> Entity
            Member member = itemDTO.toEntity();
            System.out.println(member.toString());

            //2. Respository로 --> Entity를 --> DB에 저장
            memberRepository.save(member);

        }
        catch(Exception e){
            //err
        }

        return "redirect:/";

        /*
        회원리스트
         */
    }


    @RequestMapping(value = "jpa/vuln-test.html", method = RequestMethod.GET)
    public String vulnTest() {

        return "jpa/vuln-test.html";
    }

    @RequestMapping(value = "jpa/ButtonTest.html", method = RequestMethod.GET)
    public String ButtonTest(Model model) {

        //JPA 방식
        List<Member> members = memberRepository.findAll();

        //객체리스트 전달 - 모델에 담아서 리스트 뷰페이지로 전달
        model.addAttribute("members", members);

        return "jpa/ButtonTest.html";
    }
    @RequestMapping(value = "static/bookList.html", method = RequestMethod.GET)
    public String bookList(Model model) {

        //JPA 방식
        List<Member> members = memberRepository.findAll();

        //객체리스트 전달 - 모델에 담아서 리스트 뷰페이지로 전달
        model.addAttribute("members", members);

        return "static/bookList.html";
    }


    @RequestMapping(value = "../../static/404.html", method = RequestMethod.GET)
    public String Test() {

        return "../../static/404.html";
    }



    /*
    @RequestMapping(value = "/jpa/bookingList", method = RequestMethod.GET)
    public String bookingList(Model model) {

        return "jpa/bookingList";
    }
    */

    @RequestMapping(value = "jpa/bookingList", method = RequestMethod.GET)
    public String bookingList(Model model) {

        //JPA 방식
        List<Member> members = memberRepository.findAll();

        //객체리스트 전달 - 모델에 담아서 리스트 뷰페이지로 전달
        model.addAttribute("members", members);


        return "jpa/itemList";
    }



}
