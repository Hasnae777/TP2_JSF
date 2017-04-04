import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


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
