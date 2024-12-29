package com.exam_website.common.constant;

public class ExamConstants {
    private ExamConstants() {}

    public static final class Cache {
        public static final String QUESTIONS = "questions";
        public static final String EXAMS = "exams";
        public static final long CACHE_TTL = 3600; // 1 hour
    }

    public static final class Validation {
        public static final int MIN_CHOICES = 2;
        public static final int MAX_CHOICES = 10;
        public static final int MIN_QUESTIONS = 1;
        public static final int MAX_QUESTIONS = 100;
        public static final int MIN_TIME_LIMIT = 1;
        public static final int MAX_TIME_LIMIT = 180;
    }
}
