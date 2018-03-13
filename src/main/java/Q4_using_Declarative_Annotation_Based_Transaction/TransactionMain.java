package Q4_using_Declarative_Annotation_Based_Transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionMain {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);

    accountService.Transferamount("pia",100,"payal");
    }
}