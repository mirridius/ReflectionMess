import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface LoadMarketingOffer {
    String clientId() default "";
}
