package com.codewithmosh.abstractFactory;

public class WeightLossGoalFactory implements GoalFactory{
    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }
}
