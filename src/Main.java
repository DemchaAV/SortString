import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SortStringMasive ssm = new SortStringMasive();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для сортировки текста: ");
        String s = "\"Difficult to tell for how long. But only once the water subsides and the ground dries out will Ukraine have the same chance of a river crossing as it did before the flood.\"\n" +
                "\n" +
                "And he believes an attack across the swollen Dnipro is not out of the question even now.\n" +
                "\n" +
                "\"It's not impossible to do an assault river crossing across a river that's in full flood. It's just more difficult,\" he said.\n" +
                "\n" +
                "The Russians have blamed the Ukrainians for the attack, but most analysts have dismissed that as unlikely to impossible.";
        String[] sArray = ssm.stringToArray(s);
        ssm.sortArray(sArray);

        for (String bbAr : sArray)
            System.out.println(bbAr);


    }
}
