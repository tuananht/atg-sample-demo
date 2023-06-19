import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-create-a-folder-and-save-the-screenshot-on-the-folder-created'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-create-a-folder-and-save-the-screenshot-on-the-folder-created/58629')

'step 2: Add visual checkpoint at Page_t_how-to-create-a-folder-and-save-the-screenshot-on-the-folder-created'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00054_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
