package org.jboss.errai.ui.test.i18n.client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.shared.TemplateWidgetMapper;
import org.jboss.errai.ui.shared.api.annotations.Bundle;
import org.jboss.errai.ui.test.i18n.client.res.I18nComponent;
import org.jboss.errai.ui.test.i18n.client.res.NonCompositeI18nComponent;

import com.google.gwt.user.client.ui.RootPanel;

@Dependent
@Bundle("I18nTemplateTest.json")
public class NonCompositeI18nTemplateTestApp implements I18nTemplateTestApp {

  @Inject
  private RootPanel root;

  @Inject
  private NonCompositeI18nComponent component;

  @PostConstruct
  public void setup() {
    root.add(TemplateWidgetMapper.get(component));
  }

  @PreDestroy
  public void tearDown() {
    root.clear();
  }

  @Override
  public I18nComponent getComponent() {
    return component;
  }
}