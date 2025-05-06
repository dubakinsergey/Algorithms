package eight_and_seven_kyu;

/*
Описание:
Предложение Smash
Напишите функцию, которая берет массив слов, объединяет их в предложение и возвращает предложение.
Вы можете игнорировать необходимость очистки слов или добавления знаков препинания, но вы должны добавлять пробелы между каждым словом.
Будьте осторожны, в начале или конце предложения не должно быть пробела!

Пример
['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
words = ['hello', 'world', 'this', 'is', 'great']
smash(words) # returns "hello world this is great"
*/

public class SmashWords {
    public static String smash(String... words) {

        StringBuilder sentenceOfWords = new StringBuilder();
        for (String el : words
        ) {
            sentenceOfWords.append(el).append(" ");
        }
        String finishSentence = sentenceOfWords.toString().trim();

        return finishSentence;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "this", "is", "great" };
        System.out.println(smash(words));
    }
}