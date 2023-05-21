package com.example.myquiz

object Constants {
    const val USER_NAME: String = "user_name"

    //Frage_1
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,"Zu welchem Land gehört die Flagge",
            R.drawable.low_angle_shot_of_a_waving_flag_of_germany_against_2023_03_01_01_19_10_utc,
            "Frankreich",
            "Russland",
            "Deutschland",
            "Argentinien",
            3)
            questionList.add(question1)

        //Frage_2
        val question2 = Question(
            1,"Zu welchem Land gehört die Flagge",
            R.drawable.breathtaking_shot_of_canadian_flags_flying_at_top_2022_12_18_20_55_01_utc,
            "England",
            "Deutschland",
            "Schweiz",
            "Canada",
            4)
            questionList.add(question2)

        //Frage_3
        val question3 = Question(
            1,"Zu welchem Land gehört die Flagge",
            R.drawable.american_flag_usa_flag_2021_08_30_09_19_14_utc,
            "USA",
            "Schweden",
            "Pakistan",
            "Türkei",
            1)
        questionList.add(question3)

        //Frage_4
        val question4 = Question(
            1,"Zu welchem Land gehört die Flagge",
            R.drawable.turkish_flag_2022_11_09_16_05_07_utc,
            "Marokko",
            "Pakistan",
            "Türkei",
            "Albanien",
            1)
        questionList.add(question4)


        return questionList
    }
}