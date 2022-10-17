import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Collections {

//    Есть входной файл с набором слов, написанных через пробел
//
//Необходимо:
//
//        - Прочитать слова из файла.
//
//        - Отсортировать в алфавитном порядке.
//
//        - Посчитать сколько раз каждое слово встречается в файле
//
//        - Вывести статистику на консоль
//
//        - Найти слово с максимальным количеством повторений
//
//        - Вывести на консоль это слово и сколько раз оно встречается в файле

    public static void main(String[] args) {
        startProgram("files/words.txt");
    }

    public static void startProgram(String filepath) {
        Map<String, Integer> wordList = new TreeMap<>();
        String text = readFile(filepath);
        String[] words = text.split(filepath);
        for (String word : words) {
            if (!wordList.containsKey(word)) {
                wordList.put(word,1);
            } else {
                wordList.put(word, wordList.get(word)+1);
            }
        }
        System.out.println("Слово/Количество повторений");
        String key = null;
        int value = 0;
        int repit = 0;
        for (Map.Entry<String, Integer> entry : wordList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > repit) {
                repit = value;
                System.out.println(key + " " + value);
            }
        }
        for (Map.Entry<String, Integer> entry : wordList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == repit) {
                System.out.println("\nСлово" + value + " встречается в файле"+ key + " раз");
            }
        }
    }

    private static String readFile(String filepath) {
        File file = new File(filepath);
        String text = null;
        try (FileReader reader = new FileReader(file)) {
            char[]buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0 ) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf,c);
                }
            }
            text = String.valueOf(buf);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}