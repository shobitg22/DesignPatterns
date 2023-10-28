package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director mbaStudent = new Director(new MBAStudent());
        System.out.println("MBA :- "+mbaStudent.getStudent());

        Director mcaStudent = new Director(new MCAStudent());
        System.out.println("MCA :- "+mcaStudent.getStudent());

    }
}