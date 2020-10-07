package com.techelevator;

public class QuizQuestion {


        private String question;
        private String[] answers = new String[4];
        private int correctAnswer;

	public QuizQuestion(String quizQuestion) {
        formatQuizQuestion(quizQuestion);
    }

        @Override
        public String toString() {
        String newline = System.getProperty("line.separator");

        return question + newline + newline +
                "1. " + answers[0] + newline +
                "2. " + answers[1] + newline +
                "3. " + answers[2] + newline +
                "4. " + answers[3] + newline;
    }

        public int getCorrectAnswerIndex() {
        return correctAnswer;
    }
        public void formatQuizQuestion(String quizQuestionsFromFile) {
        String[] questionAndFourAnswers = quizQuestionsFromFile.split("\\|");
        question = questionAndFourAnswers[0];

        for (int i = 0; i < 4; i++) {
            if (questionAndFourAnswers[i + 1].contains("*")) {
                answers[i] = questionAndFourAnswers[i + 1].substring(0, questionAndFourAnswers[i + 1].length() - 1);
                correctAnswer = i + 1;
            } else {
                answers[i] = questionAndFourAnswers[i + 1];
            }
        }
    }

    }

