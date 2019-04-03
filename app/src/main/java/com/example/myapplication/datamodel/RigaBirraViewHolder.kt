package layout

import android.support.v7.widget.RecyclerView
import android.view.View

class RigaBirraViewHolder(view: View): RecyclerView:ViewHolder(view) {
    val tvNome=view.textNome
    val tvProduttore=view.textProduttore
}