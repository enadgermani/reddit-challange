package challange;

public class player {
char name;
int score;

public player(char n) {
	name=n;
	score=0;
}

public int addpoint(boolean plus) {
	if(plus) {
		score++;
		return score;
	}
	else {
		score--;
		return score;
	}
	
}
public void stampa() {
	System.out.println(name + ":" + score + " ");
}

}
