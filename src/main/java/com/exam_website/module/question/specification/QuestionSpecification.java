package com.exam_website.module.question.specification;

//public class QuestionSpecification {
//    public static Specification<Question> withFilters(QuestionSearchRequest request) {
//        return (root, query, cb) -> {
//            List<Predicate> predicates = new ArrayList<>();
//
//            if (StringUtils.hasText(request.getType())) {
//                predicates.add(cb.equal(root.get("type").get("name"), request.getType()));
//            }
//
//            if (StringUtils.hasText(request.getDifficultyLevel())) {
//                predicates.add(cb.equal(root.get("difficultyLevel"), request.getDifficultyLevel()));
//            }
//
//            if (request.getMinPoints() != null) {
//                predicates.add(cb.greaterThanOrEqualTo(root.get("points"), request.getMinPoints()));
//            }
//
//            if (request.getMaxPoints() != null) {
//                predicates.add(cb.lessThanOrEqualTo(root.get("points"), request.getMaxPoints()));
//            }
//
//            return cb.and(predicates.toArray(new Predicate[0]));
//        };
//    }
//}