package edidwi.com.tugasedi

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class AdapterPager (fm: FragmentManager): FragmentPagerAdapter(fm){
    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
            Profilku(), Hobbyku(), Alamat(),Citacita()
    )
    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getCount(): Int {
        return pages.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            2 -> "Third Tab"
            else -> "Four Tab"
        }
    }
}