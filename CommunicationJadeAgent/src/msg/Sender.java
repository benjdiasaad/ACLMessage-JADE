package msg;

import jade.core.AID;
import jade.core.Agent;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Sender extends Agent {
	   
	@Override
	protected void setup(){
		
		addBehaviour(new OneShotBehaviour() {
			
			@Override
			public void action() {
				ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
				//set the message content to send
				msg.setContent("Bonjour Saad");
				//add a the message receiver
				msg.addReceiver(new AID("receiver",AID.ISLOCALNAME));
				//send the message
				send(msg);
			}
		});	
	}
}