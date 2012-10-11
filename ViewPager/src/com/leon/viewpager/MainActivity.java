package com.leon.viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.leon.adapter.AdapterViewPager;
import com.viewpagerindicator.CirclePageIndicator;

// Utilizo ActionBarSherlock 
// Pero puede funcionar sin la librería
// Necesitan descargar la libreria de ViewPagerIndicator y agregarla como referencia para poder usarla
public class MainActivity extends SherlockFragmentActivity {

	private AdapterViewPager adapterViewPager;
	private ViewPager viewPager;
	private CirclePageIndicator circlePageIndicator;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock_Light);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Creamos la referencia para el adapter
		this.adapterViewPager = new AdapterViewPager(
				this.getSupportFragmentManager());
		// Referencia hacia el ViewPager
		viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(adapterViewPager);

		// Referencia hacia el CirclePageIndicator
		// Mandamos el ViewPager donde se creará la vista de cada fragment
		// Compilando con Java 6 no hay ningun problema
		// En la versión de android 4.0.3
		circlePageIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
		circlePageIndicator.setViewPager(viewPager);
		circlePageIndicator.setBackgroundColor(Color.BLUE);
		circlePageIndicator.setRadius(15);

	}

}
