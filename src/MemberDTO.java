public class MemberDTO {
    public String name;
    public String phone;
    public String mail;

    public MemberDTO() {
        // 아무 정보도 모를때
    }

    public MemberDTO(String name) {
        //이름만 알때
        this.name = name;
    }

    public MemberDTO(String name, String phone) {
        //이름과 전화번호만 알때
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String mail) {
        //모든 정보를 알때
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

}
