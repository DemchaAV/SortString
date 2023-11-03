import java.util.Scanner;


public class SortStringMasive {

    String textToSort;
    String type;
    String uperString;
    int countWords = 0;
    String lCheck = "ABCDEFGHIJKLMNOPQRSTUVWXYZАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ\'";
    int posString = 0;

    public String[] stringToArray(String s) {
        textToSort = s;
        if (this.textToSort == null) {
            // обработка случая, когда s равна null
            System.out.println("//////////////////////////////////" +
                    "\n///         Строка пуста!      ///" +
                    "\n//////////////////////////////////");
            return new String[0];
        }//Is empty< if the string null break the methods
        uperString = s.toUpperCase();
        System.out.println("Введите параметр сортировки \n ru - если только руские \n en -only english \n press Enter if you whant mix \n===========");
        Scanner scanner = new Scanner(System.in);
        type = scanner.nextLine(); //input for type of sort
        lCheck = methodTypeOfSort();//choose type of methods
        countWords = allocation(s); //amount of capacity array
        System.out.println("Количество слов :  " + countWords);
        System.out.println();
        String[] myArray = new String[countWords];
        myArray = initializationMasive(s, myArray);
        return myArray;
    }

    private boolean isLeter(String uperString, int posString) {
        boolean leter = lCheck.indexOf(uperString.charAt(posString)) != -1; //Это буква?
        return leter;
    }

    private boolean isSumbol(String uperString, int posString) {
        boolean leter = lCheck.indexOf(uperString.charAt(posString)) == -1; //Это буква?
        return leter;
    }

    public String translite(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            switch (c) {
                case 'а':
                    sb.setCharAt(i, 'a');
                    break;
                case 'б':
                    sb.setCharAt(i, 'b');
                    break;
                case 'в':
                    sb.setCharAt(i, 'v');
                    break;
                case 'г':
                    sb.setCharAt(i, 'g');
                    break;
                case 'д':
                    sb.setCharAt(i, 'd');
                    break;
                case 'е':
                    sb.setCharAt(i, 'e');
                    break;
                case 'ж':
                    sb.setCharAt(i, 'j');
                    break;
                case 'з':
                    sb.setCharAt(i, 'z');
                    break;
                case 'и':
                    sb.setCharAt(i, 'i');
                    break;
                case 'й':
                    sb.replace(i, i + 1, "iy");
                    i++;
                    break;
                case 'к':
                    sb.setCharAt(i, 'k');
                    break;
                case 'л':
                    sb.setCharAt(i, 'l');
                    break;
                case 'м':
                    sb.setCharAt(i, 'm');
                    break;
                case 'н':
                    sb.setCharAt(i, 'n');
                    break;
                case 'о':
                    sb.setCharAt(i, 'o');
                    break;
                case 'п':
                    sb.setCharAt(i, 'p');
                    break;
                case 'р':
                    sb.setCharAt(i, 'r');
                    break;
                case 'с':
                    sb.setCharAt(i, 's');
                    break;
                case 'т':
                    sb.setCharAt(i, 't');
                    break;
                case 'у':
                    sb.setCharAt(i, 'u');
                    break;
                case 'ф':
                    sb.setCharAt(i, 'f');
                    break;
                case 'х':
                    sb.setCharAt(i, 'h');
                    break;
                case 'ц':
                    sb.setCharAt(i, 'c');
                    break;
                case 'ч':
                    sb.replace(i, i + 1, "ch");
                    i++;
                    break;
                case 'щ':
                    sb.replace(i, i + 1, "shch");
                    i = i + 3;
                    break;
                case 'ь':
                    sb.setCharAt(i, '`');
                    break;
                case 'ы':
                    sb.setCharAt(i, 'y');
                    break;
                case 'ъ':
                    sb.deleteCharAt(i);
                    i--;
                    break;
                case 'э':
                    sb.setCharAt(i, 'e');
                    break;
                case 'ю':
                    sb.replace(i, i + 1, "yu");
                    i++;
                    break;
                case 'я':
                    sb.replace(i, i + 1, "ya");
                    i++;
                    break;

                case 'А':
                    sb.setCharAt(i, 'A');
                    break;
                case 'Б':
                    sb.setCharAt(i, 'B');
                    break;
                case 'В':
                    sb.setCharAt(i, 'V');
                    break;
                case 'Г':
                    sb.setCharAt(i, 'G');
                    break;
                case 'Д':
                    sb.setCharAt(i, 'D');
                    break;
                case 'Е':
                    sb.setCharAt(i, 'E');
                    break;
                case 'Ж':
                    sb.setCharAt(i, 'J');
                    break;
                case 'З':
                    sb.setCharAt(i, 'Z');
                    break;
                case 'И':
                    sb.setCharAt(i, 'I');
                    break;
                case 'Й':
                    sb.replace(i, i + 1, "Iy");
                    i++;
                    break;
                case 'К':
                    sb.setCharAt(i, 'K');
                    break;
                case 'Л':
                    sb.setCharAt(i, 'L');
                    break;
                case 'М':
                    sb.setCharAt(i, 'M');
                    break;
                case 'Н':
                    sb.setCharAt(i, 'N');
                    break;
                case 'О':
                    sb.setCharAt(i, 'O');
                    break;
                case 'П':
                    sb.setCharAt(i, 'P');
                    break;
                case 'Р':
                    sb.setCharAt(i, 'R');
                    break;
                case 'С':
                    sb.setCharAt(i, 'S');
                    break;
                case 'Т':
                    sb.setCharAt(i, 'T');
                    break;
                case 'У':
                    sb.setCharAt(i, 'U');
                    break;
                case 'Ф':
                    sb.setCharAt(i, 'F');
                    break;
                case 'Х':
                    sb.setCharAt(i, 'H');
                    break;
                case 'Ч':
                    sb.replace(i, i + 1, "Ch");
                    i++;
                case 'Ц':
                    sb.setCharAt(i, 'C');
                    break;
                case 'Щ':
                    sb.replace(i, i + 1, "SHCH");
                    i = i + 3;
                    break;
                case 'Ь':
                    sb.setCharAt(i, '`');
                    break;
                case 'Ы':
                    sb.setCharAt(i, 'Y');
                    break;
                case 'Ъ':
                    sb.deleteCharAt(i);
                    i--;
                    break;
                case 'Э':
                    sb.setCharAt(i, 'E');
                    break;
                case 'Ю':
                    sb.replace(i, i + 1, "Yu");
                    i++;
                    break;
                case 'Я':
                    sb.replace(i, i + 1, "Ya");
                    i++;
                    break;


                default:
                    break;
            }
        }
        System.out.println(sb.toString());

        return sb.toString();
    }


    public String methodTypeOfSort() {


        switch (type.toLowerCase()) {
            case "en" -> lCheck = "ABCDEFGHIJKLMNOPQRSTUVWXYZ'";
            case "ru" -> lCheck = "'АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
            default -> {
            }
        }
        return lCheck;


    }

    private int allocation(String uperString) {
        countWords = 0;
        posString = -1;
        uperString = uperString.toUpperCase();
        while (posString < uperString.length()) {
            posString++;
            if (posString >= uperString.length()) {
                break;
            }
            if (isLeter(uperString, posString)) {
                countWords++;
                int startWord = posString;
                int endWord = startWord;
                endWord = cutWords(endWord, uperString);
                if (endWord == uperString.length() && endWord == 1) {
                    continue;
                }
                posString = endWord;
                if (posString >= uperString.length() - 1) {
                    break;
                }
            } else {
                startWord(posString, textToSort);//look for start of word
            }
        }
        return countWords;
    }


    private int startWord(int posString, String uperString) {
        uperString = uperString.toUpperCase();
        while (isSumbol(uperString, posString) && posString < textToSort.length()) {
            posString++;
            if (posString >= textToSort.length() - 1) {
                break;
            }
        }
        return posString;
    }

    private int cutWords(int endWord, String uperString) {
        uperString = uperString.toUpperCase();
        while (endWord < uperString.length() && lCheck.indexOf(uperString.charAt(endWord)) != -1) {
            endWord++;
            if (endWord >= uperString.length()) {
                endWord = uperString.length();
            }
        }
        return endWord;
    }

    private String[] initializationMasive(String uperString, String[] myArray) {
        posString = -1;
        int countMasive = -1;
        uperString = uperString.toUpperCase();
        StringWhileMasive:
        while (posString < uperString.length()) {
            posString++;
            if (posString >= uperString.length()) {
                break;
            }
            if (isLeter(uperString, posString)) {
                countMasive++;
                int startWord = posString;
                int endWord = startWord;
                endWord = cutWords(endWord, uperString);
                if (endWord == uperString.length() && endWord == 1) {
                    myArray[countMasive] = textToSort.substring(startWord);
                    continue;
                }
                myArray[countMasive] = textToSort.substring(startWord, endWord);
                posString = endWord;
                if (posString >= uperString.length() - 1) {
                    break;
                }
            } else {
                startWord(posString, textToSort);//look for start of word
            }
        }
        return myArray;
    }

    private String[] DrySortArray(String lCheck, String myArray[]) {
        String[] temp = new String[1];
        int countAr = 0;
        int lenghth = myArray.length;
        int CountArray = 0;
        for (int i = 0; i < lCheck.length() && countAr < lenghth; i++) {
            int lineSeparator = 0;
            CountArray++;

            mString:
            for (int j = countAr; j < lenghth; j++) {
                CountArray++;
                if (myArray[j].toUpperCase().charAt(0) == lCheck.charAt(i)) {
                    if (countAr == j) {
                        countAr++;
                        lineSeparator++;
                        continue mString;
                    }
                    temp[0] = myArray[countAr];
                    myArray[countAr] = myArray[j];
                    myArray[j] = temp[0];
                    countAr++;
                    lineSeparator++;
                }
            }

        }
        System.out.println();

        System.out.println("Интераций было: " + CountArray);
        return myArray;

    }//метод поризводит поиск слов по каждой букве алфавита

    public String[] sortArray(String myArray[]) {
        String[] temp = new String[1];
        int curPos = 0;
        int lenghth = myArray.length;
        //int CountArray = 0;
        OUTER:
        do {
            //CountArray++;//count loop
            int min = curPos;
            while (min < lenghth) {
                if (myArray[curPos].toUpperCase().charAt(0) > myArray[min].toUpperCase().charAt(0)) {
                    //CountArray++;//count loops
                    temp[0] = myArray[curPos];
                    myArray[curPos] = myArray[min];
                    myArray[min] = temp[0];
                    if (lCheck.indexOf(myArray[min].toUpperCase().charAt(0)) == 0 || lCheck.indexOf(myArray[min].toUpperCase().charAt(0)) == 26) {
                        curPos++;
                        continue OUTER;

                    }
                }
                min++;
            }
            int dub = curPos;
            SearchDub:
            while (dub < lenghth - 1) {
                // CountArray++;
                dub++;
                if (lCheck.indexOf(myArray[curPos].toUpperCase().charAt(0)) == lCheck.indexOf(myArray[dub].toUpperCase().charAt(0))) {
                    if (dub == (curPos)) {
                        curPos++;
                    } else {
                        temp[0] = myArray[curPos + 1];
                        myArray[curPos + 1] = myArray[dub];
                        myArray[dub] = temp[0];
                        curPos++;
                    }
                }

            }


            if (curPos >= lenghth - 1) {
                break;

            }
            curPos++;

        } while (curPos < lenghth - 1);
        //  System.out.println();
        //System.out.println("Интерайций было: " + CountArray);
        return myArray;

    }//метод переберает масив сравнивая слова дроуг с другом

}
