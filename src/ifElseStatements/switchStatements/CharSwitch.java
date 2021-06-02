package ifElseStatements.switchStatements;

public class CharSwitch {

    public static void main(String[] args) {
        char c = 'A';

        switch (c){
            case 'A':
                System.out.println("This is first letter and it is uppercase");
            case 'Z':
                System.out.println("This is last letter and it is uppercase");
                break;
            case 'a':
                System.out.println("This is first letter and it is lowercase");
            case 'z':
                System.out.println("This is last letter and it is lowercase");
                break;
            default:
                System.out.println("This is not first or last letter");
        }
    }
}
