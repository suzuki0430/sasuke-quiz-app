package jp.example.sasukeapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "2000年春、自宅にSASUKEを模したセットを製作して練習に熱中したことにより、ボンベ配送業の仕事を失ったレジェンドは誰？",
            "長野誠", "秋山和彦",
            "山田勝巳", "山本進悟", 3
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "2012年年末、5度目の引退をしたレジェンドは誰？",
            "秋山和彦", "長野誠",
            "山本進悟", "山田勝巳", 4
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "1stステージ連続クリア記録と1stステージ連続リタイア記録をもっているレジェンドは誰？",
            "山田勝巳", "長野誠",
            "山本進悟", "秋山和彦", 1
        )

        questionsList.add(que3)

        val que4 = Question(
            4, "FINALステージ攻略のため、少しでも体重を軽くしようと絶食したものの、意識朦朧となってリタイアしたレジェンドは誰？",
            "山本進悟", "長野誠",
            "秋山和彦", "山田勝巳", 4
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "2002年秋、「俺にはSASUKEしかないんですよ」の名言を残したレジェンドは誰？",
            "秋山和彦", "山田勝巳",
            "山本進悟", "長野誠", 2
        )

        questionsList.add(que5)

        return questionsList
    }
}