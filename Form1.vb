Public Class Form1
    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged
        If TextBox1.Text = "" Then
            MsgBox("Please Enter your Height!")
        End If
        If TextBox2.Text = "" Then
            MsgBox("Please Enter your Weght!")
        End If
        Dim height, weight, bmi As Single
        height = TextBox1.Text
        weight = TextBox2.Text
        bmi = (weight) / (height ^ 2)
        Label3.Text = bmi
    End Sub
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        TextBox1.Clear()
        TextBox2.Clear()
        Label3.Text() = "0"
    End Sub
End Class

