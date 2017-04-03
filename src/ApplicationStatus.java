import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

@ManagedBean
@ApplicationScoped
public class ApplicationStatus implements Serializable {

	private static final long serialVersionUID = 1L;
	int value =0;
	public Integer getCounter(){
		return ++value;
	}
	@PostConstruct
	 void init(){
		 System.err.println("Create"+ this);
	 }
	@PreDestroy
	void close(){
		System.err.println("Close"+ this);
	}

}
