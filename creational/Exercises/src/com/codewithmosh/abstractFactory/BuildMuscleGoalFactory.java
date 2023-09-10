package com.codewithmosh.abstractFactory;

public class BuildMuscleGoalFactory implements GoalFactory{
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }
}
