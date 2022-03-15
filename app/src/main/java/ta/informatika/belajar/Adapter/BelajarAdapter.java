package ta.informatika.belajar.Adapter;
/*
class adapter untuk mengatur item-item pada recycle view
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ta.informatika.belajar.R;

public class BelajarAdapter extends RecyclerView.Adapter<BelajarAdapter.BelajarViewHolder> {

    private ArrayList<Data> listBelajar;
    private RecyclerClickViewListener listener;

    public BelajarAdapter(ArrayList<Data> listBelajar, RecyclerClickViewListener listener) {
        this.listBelajar = listBelajar;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BelajarAdapter.BelajarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_belajar, parent, false);
        return new BelajarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BelajarAdapter.BelajarViewHolder holder, int position) {
        holder.tvIndo.setText(listBelajar.get(position).getIndo());
        holder.tvLampung.setText(listBelajar.get(position).getLampung());
        holder.imB.setBackgroundResource(listBelajar.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return (listBelajar!=null) ? listBelajar.size() : 0;
    }

    public class BelajarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView tvIndo, tvLampung;
        private ImageView imB;

        public BelajarViewHolder(View view){
            super(view);

            tvIndo = view.findViewById(R.id.indoBangun);
            tvLampung = view.findViewById(R.id.lampungBangun);
            imB = view.findViewById(R.id.imgBangun);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }

    public interface RecyclerClickViewListener{
        void onClick(View v, int position);
    }
}
