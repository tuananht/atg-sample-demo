import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_org-openqa-selenium-sessionnotcreatedexception-unable-to-create-a-new-remote-session'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/org-openqa-selenium-sessionnotcreatedexception-unable-to-create-a-new-remote-session/61804')

'step 2: Add visual checkpoint at Page_t_org-openqa-selenium-sessionnotcreatedexception-unable-to-create-a-new-remote-session'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00066_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
