package com.example.teamtrackingapptest2;

public  class Members {
    String memberId;
    String memberName;
    String memberPOT;
    String memberBranch;
    String memberYear;
    String memberDateOfJoin;
    String memberProjects;




    public Members(String memberId , String memberName, String memberPOT, String memberBranch, String memberYear,String memberDateOfJoin ,String memberProjects) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPOT = memberPOT;
        this.memberBranch = memberBranch;
        this.memberYear = memberYear;
        this.memberDateOfJoin = memberDateOfJoin;
        this.memberProjects=memberProjects;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberPOT() {
        return memberPOT;
    }

    public String getMemberBranch() {
        return memberBranch;
    }

    public String getMemberYear() {
        return memberYear;
    }

    public String getMemberDateOfJoin() {
        return memberDateOfJoin;
    }

    public String getMemberProjects() {
        return memberProjects;
    }
}


