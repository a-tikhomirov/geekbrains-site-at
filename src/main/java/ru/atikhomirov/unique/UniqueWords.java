package ru.atikhomirov.unique;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String[] arrWords = {
                "Создать",
                "массив",
                "состоит",
                "слов",
                "должны",
                "встречаться",
                "повторяющиеся",
                "Найти",
                "вывести",
                "список",
                "уникальных",
                "слов",
                "которых",
                "состоит",
                "массив"
        };

        System.out.printf("Исходный массив из %d слов:\n%s\n\n", arrWords.length, Arrays.toString(arrWords));

        String[] arrUnique = getUniques(arrWords);
        System.out.printf("Список из %d уникальных слов в массиве:\n%s\n\n", arrUnique.length, Arrays.toString(arrUnique));

        System.out.printf("Подсчет уникальных слов:\n%s\n", countUniques(arrWords));
    }

    private static String[] getUniques(String[] arr) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(arr));
        return Arrays.copyOf(stringSet.toArray(), stringSet.size(), String[].class);
    }

    private static String countUniques(String[] arr) {
        String[] arrUnique = getUniques(arr);
        StringBuilder result = new StringBuilder();

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(arr));
        result.append("Всего "+ stringArrayList.size() + " слов;\n");
        for (String word:arrUnique) {
            result.append(word + "\t- " + Collections.frequency(stringArrayList, word) + ";\n");
        }

        return result.toString();
    }
}
