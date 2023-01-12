package com.gym;

public class TestDriver {

	public static void main(String[] args) {
		// user info

		IUser userobj = new UserImpl();
		User user1 = new User("Amar", "Mali", "amar", "amar123");

		userobj.register(user1, 0);

		System.out.println();
		System.out.println(userobj.login("amar", "amar123"));
		System.out.println(userobj.login("amar", "123null"));
		
		// workout info

		IWorkout workoutobj = new WorkoutImpl();
		WorkOut workout1 = new WorkOut("cardio", "trademill", 0, 10, "fittness");
		WorkOut workout2 = new WorkOut("muscle", "dumbell", 10, 5, "muscler body");

		workoutobj.addWorkout(workout1, 0);
		workoutobj.addWorkout(workout2, 1);

		WorkOut workout[] = workoutobj.displayMyWorkouts();
		for (WorkOut w : workout) {
			System.out.println(w);
		}

		// System.out.println(workoutobj.displayMyWorkouts());

	}

}
