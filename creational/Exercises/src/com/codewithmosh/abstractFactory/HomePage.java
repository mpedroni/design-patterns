package com.codewithmosh.abstractFactory;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory factory) {
        workoutPlan = factory.createWorkoutPlan();
        mealPlan = factory.createMealPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
