package com.leon.adapter;

import com.leon.fragment.ViewFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Adapter para crear las vistas de PageIndicator
public class AdapterViewPager extends FragmentPagerAdapter {

	private static final String[] nombres = new String[] { "General", "Rutas",
			"Prueba", "De", "View", "Pager" };
	private int mCount = nombres.length;

	// Constructor mandamos la referencia para poder iniciar el fragmentManager
	// de la super clase
	public AdapterViewPager(FragmentManager fm) {
		super(fm);

	}

	// Este método regresa el número de indicadores a mostrar
	// Por lo cuál regresa el tamaño del arreglo que utilizo
	@Override
	public int getCount() {
		return mCount;
	}

	@Override
	public Fragment getItem(int arg0) {
		// Creamos un fragment para cada vista

		ViewFragment fragment = new ViewFragment();
		return fragment;

	}

	// Este método se usa cuando tienes que devolver los titulos del
	// pageIndicator
	// Para poder usar los indicadores con imágenes debes implementar la interfaz
	// IconPagerAdapter
	@Override
	public CharSequence getPageTitle(int position) {
		// Regresamos un string para el title
		return AdapterViewPager.nombres[position % nombres.length];
	}

}
