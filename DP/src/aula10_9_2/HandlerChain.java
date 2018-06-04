package aula10_9_2;

/**
 * @author Leandro Holanda 816113762
 */

public interface HandlerChain {
	
	void setNextChain(HandlerChain nextChain);
	void handleRequest(int requisicao);

}