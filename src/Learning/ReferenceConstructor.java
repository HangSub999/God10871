package Learning;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor re=new ReferenceConstructor();
        re.makeMemberObject();
    }
    public void makeMemberObject(){
        MemberDTO dto1= new MemberDTO();
        MemberDTO dto2= new MemberDTO("Sangmin");
        MemberDTO dto3= new MemberDTO("Sangmin","01054095929");
        MemberDTO dto4= new MemberDTO("Sangmin","01054095929","good@naver.com");
    }
}
