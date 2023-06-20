import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_vu_tran_messages_group_moderators'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/vu.tran/messages/group/moderators')

'step 2: Add visual checkpoint at Page_u_vu_tran_messages_group_moderators'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00772_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
