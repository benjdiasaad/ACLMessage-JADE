package msg;

import javax.swing.JOptionPane;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.*;


public class Receiver extends Agent {

	@Override
	protected void setup(){
		addBehaviour(new CyclicBehaviour() {
			
			@Override
			public void action() {
				//Receive the other agent message
				ACLMessage msg = receive();
				if(msg!=null) {
					//Show the received message in a dialog box
					JOptionPane.showMessageDialog(null,"Message received " 
					+msg.getContent());
				}else block();
			}
		});
		
 }
}
