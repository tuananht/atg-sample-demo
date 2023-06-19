import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_caused-by-caused-by-org-openqa-selenium-nosuchsessionexception-invalid-session-id'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/caused-by-caused-by-org-openqa-selenium-nosuchsessionexception-invalid-session-id/57247')

'step 2: Add visual checkpoint at Page_t_caused-by-caused-by-org-openqa-selenium-nosuchsessionexception-invalid-session-id'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00146_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
