package com.codewithmosh.abstractFactory;

public interface GoalFactory {
    MealPlan createMealPlan();
    WorkoutPlan createWorkoutPlan();
}
