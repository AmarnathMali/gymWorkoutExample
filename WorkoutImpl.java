package com.gym;

public class WorkoutImpl implements IWorkout {
	
	public WorkOut workouts[];
	WorkoutImpl(){
		workouts = new WorkOut[5];
	}
	@Override
	public void addWorkout(WorkOut workout, int index) {
		// TODO Auto-generated method stub
		System.out.println("workout is : "+ workout);
		workouts[index] = workout;
		
	}
	@Override
	public WorkOut[] displayMyWorkouts() {
		// TODO Auto-generated method stub
		return workouts;
	}

}
