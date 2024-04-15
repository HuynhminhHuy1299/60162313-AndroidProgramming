package hmh.edu.vd_examlist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class examViewHolder extends RecyclerView.ViewHolder {
    TextView examName;
    TextView examMessage;
    TextView examDate;
    View view;

    examViewHolder(View itemView)
    {
        super(itemView);
        examName
                = (TextView)itemView
                .findViewById(R.id.examName);
        examDate
                = (TextView)itemView
                .findViewById(R.id.examDate);
        examMessage
                = (TextView)itemView
                .findViewById(R.id.examMessage);
        view  = itemView;
    }
    public class ClickListiner{

        // here index is index
// of item clicked
        public ClickListiner(int index) {

        }
    }
    private class ImageGalleryAdapter2<index> extends RecyclerView.Adapter<examViewHolder> {

        List<examData> list = Collections.emptyList();

        Context context;
        ClickListiner listiner;

        public ImageGalleryAdapter2(List<examData> list, Context context,ClickListiner listiner)
        {
            this.list = list;
            this.context = context;
            this.listiner = listiner;
        }

        @Override
        public examViewHolder
        onCreateViewHolder(ViewGroup parent, int viewType)
        {

            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            // Inflate the layout

            View photoView = inflater.inflate(R.layout.card_exam, parent, false);

            examViewHolder viewHolder
                    = new examViewHolder(photoView);
            return viewHolder;
        }

        @NonNull
        @Override
        public examViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void
        onBindViewHolder(final examViewHolder viewHolder,
                         final int position)
        {
            final index = viewHolder.getAdapterPosition();
            viewHolder.examName
                    .setText(list.get(position).name);
            viewHolder.examDate
                    .setText(list.get(position).date);
            viewHolder.examMessage
                    .setText(list.get(position).message);
            viewHolder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    listiner.click(index);
                }
            });
        }

        @Override
        public int getItemCount()
        {
            return list.size();
        }

        @Override
        public void onAttachedToRecyclerView(
                RecyclerView recyclerView)
        {
            super.onAttachedToRecyclerView(recyclerView);
        }


    }
}
