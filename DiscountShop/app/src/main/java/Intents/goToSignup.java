package intents;

import android.content.Context;
import android.content.Intent;

import product_exp.discountshop.ConsumerRegister;
import product_exp.discountshop.RetailerRegister;
import product_exp.discountshop.retailerLogin;

/**
 * Created by Ravi on 4/12/2015.
 */
public class goToSignup implements ClickInterface {
    public goToSignup(Context packageContext, Class<?> cl, Object inputOne, Object inputTwo) {
        Class<?> myclass = packageContext.getClass();
        Intent signUp = new Intent();
        if (myclass.equals(retailerLogin.class)) {
            signUp.setClass(packageContext, RetailerRegister.class);
        } else {
            signUp.setClass(packageContext, ConsumerRegister.class);
        }
        packageContext.startActivity(signUp);
    }
}
