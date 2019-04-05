package com.git;

@RestController
@EnableAuto
public class GitRun {

    @GetMapping("/git")
    public String get(){
        return "new Git!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitRun.class,args);
    }

}
