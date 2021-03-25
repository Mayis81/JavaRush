package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random random = new Random();
        String answer = null;
        switch(random.nextInt(8)){
            case 0:
                return answer = CERTAIN;

            case 1:
                return answer = DEFINITELY;

            case 2:
                return answer = MOST_LIKELY;

            case 3:
                return answer = OUTLOOK_GOOD;

            case 4:
                return answer = ASK_AGAIN_LATER;

            case 5:
                return answer = TRY_AGAIN;

            case 6:
                return answer = NO;

            case 7:
                return answer = VERY_DOUBTFUL;

            default:
                return answer;
        }
    }
}