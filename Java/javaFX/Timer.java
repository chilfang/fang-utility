package self.javafx.helper;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class Timer {
	Timeline timer;
	
	public Timer(int time, Runnable block) {
		timer = new Timeline(new KeyFrame(Duration.seconds(time), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				block.run();
			}
		}));
		timer.setCycleCount(Timeline.INDEFINITE);
	}
	public Timer(double time, Runnable block) {
		timer = new Timeline(new KeyFrame(Duration.seconds(time), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				block.run();
			}
		}));
		timer.setCycleCount(Timeline.INDEFINITE);
	}
	
	public void start() {
		timer.play();
	}
	
	public void stop() {
		timer.stop();
	}
	
	/**
	 * cycle is indefinite by default; 
	 * only use to set cycle to finite amount
	 */
	public void setCycleCount(int cycleCount) {
		timer.setCycleCount(cycleCount);
	}
}
