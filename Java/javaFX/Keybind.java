package self.javafx.helper;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Keybind {
	private String inputkey;
	private Runnable block;
	private Runnable block2 = null;

	public Keybind(String inputKey, Runnable block) {
		this.inputkey = inputKey;
		this.block = block;
	}
	public Keybind(String inputKey, Runnable block, Runnable block2) {
		this.inputkey = inputKey;
		this.block = block;
		this.block2 = block2;
	}
	
	public String getKey() {return this.inputkey;}
	public Runnable getRun() {return this.block;}
	public Runnable getRun2() {return this.block2;}

	public static void setOnKeyPressed(Stage stage, String inputKey, Runnable block) {
		stage.getScene().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == inputKey) {
	    			block.run();
	    		}
	    	}
	    });
	}
	public static void setOnKeyPressed(Stage stage, String inputKey, Runnable block, Runnable block2) {
		stage.getScene().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == inputKey) {
	    			block.run();
	    		} else {
	    			block2.run();
	    		}
	    	}
	    });
	}
	public static void setOnKeyPressed(Stage stage, Keybind keybind) {
		stage.getScene().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == keybind.getKey()) {
	    			keybind.getRun().run();
	    		} else if (keybind.getRun2() != null) {
	    			keybind.getRun2().run();
				}
	    	}
	    });
	}
	public static void setOnKeyPressed(Stage stage, Keybind... keybinds) {
		stage.getScene().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent key) {
				for (Keybind keybind : keybinds) {
					if (key.getCode().toString() == keybind.getKey()) {
						keybind.getRun().run();
					} else if (keybind.getRun2() != null) {
		    			keybind.getRun2().run();
					}
				}
	    	}
	    });
	}
	
	
	public static void setOnKeyReleased(Stage stage, String inputKey, Runnable block) {
		stage.getScene().addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == inputKey) {
	    			block.run();
	    		}
	    	}
	    });
	}
	public static void setOnKeyReleased(Stage stage, String inputKey, Runnable block, Runnable block2) {
		stage.getScene().addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == inputKey) {
	    			block.run();
	    		} else {
	    			block2.run();
	    		}
	    	}
	    });
	}
	public static void setOnKeyReleased(Stage stage, Keybind keybind) {
		stage.getScene().addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == keybind.getKey()) {
	    			keybind.getRun().run();
	    		} else if (keybind.getRun2() != null) {
	    			keybind.getRun2().run();
				}
	    	}
	    });
	}
	public static void setOnKeyReleased(Stage stage, Keybind... keybinds) {
		stage.getScene().addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent key) {
				for (Keybind keybind : keybinds) {
					if (key.getCode().toString() == keybind.getKey()) {
						keybind.getRun().run();
					} else if (keybind.getRun2() != null) {
		    			keybind.getRun2().run();
					}
				}
	    	}
	    });
	}
	
	
	public static void setOnKeyTyped(Stage stage, String inputKey, Runnable block) {
		stage.getScene().addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == inputKey) {
	    			block.run();
	    		}
	    	}
	    });
	}
	public static void setOnKeyTyped(Stage stage, String inputKey, Runnable block, Runnable block2) {
		stage.getScene().addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == inputKey) {
	    			block.run();
	    		} else {
	    			block2.run();
	    		}
	    	}
	    });
	}
	public static void setOnKeyTyped(Stage stage, Keybind keybind) {
		stage.getScene().addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
	    	@Override
	    	public void handle(KeyEvent key) {
	    		if (key.getCode().toString() == keybind.getKey()) {
	    			keybind.getRun().run();
	    		} else if (keybind.getRun2() != null) {
	    			keybind.getRun2().run();
				}
	    	}
	    });
	}
	public static void setOnKeyTyped(Stage stage, Keybind... keybinds) {
		stage.getScene().addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent key) {
				for (Keybind keybind : keybinds) {
					if (key.getCode().toString() == keybind.getKey()) {
						keybind.getRun().run();
					} else if (keybind.getRun2() != null) {
		    			keybind.getRun2().run();
					}
				}
	    	}
	    });
	}
}
