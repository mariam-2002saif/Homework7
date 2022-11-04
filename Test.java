public class Test {
    public static void main(String[] args) {
        BasicAccount BA=new BasicAccount();
        BA.deposits(100);
        System.out.println(BA.getBalance());
        BA.withdraws(101);
        System.out.println(BA.getBalance());
        FillQuestion f=new FillQuestion();
        f.setText("MY NAME IS _Mariam_");
        f.display();
        System.out.println(f.getTextWithAnswer());
        Question q=new Question();
        q.setText("what is your name?");
        q.setAnswer("mariam");
        q.display();
        System.out.println(q.check_answer("Mariam"));
        BetterRectangl b=new BetterRectangl(6,3,9,6);
        System.out.println(b.getPerimeter());
        System.out.println(b.getArea());
        Students s=new Students("Saif","2020","NOTHING");
        System.out.println(s.toString());
        Instructor i=new Instructor("Abrar","2000",10000);
        System.out.println(i.toString());
    }
}
