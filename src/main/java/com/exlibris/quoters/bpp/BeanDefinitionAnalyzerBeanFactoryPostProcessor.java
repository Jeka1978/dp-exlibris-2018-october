package com.exlibris.quoters.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@Component
public class BeanDefinitionAnalyzerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        Arrays.stream(factory.getBeanDefinitionNames())
                .map(factory::getBeanDefinition)
                .forEach(beanDefinition -> {
                    AbstractBeanDefinition bd = (AbstractBeanDefinition) beanDefinition;
                    if (bd.isPrototype() && bd.getDestroyMethodName() != null) {
                        throw new RuntimeException("You are an idiot!!!");
                    }
                });
    }
}
