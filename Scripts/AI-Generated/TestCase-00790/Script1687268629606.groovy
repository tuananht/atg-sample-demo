import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_session_email-logind6a5de3968c4ecadecd8af345dedb'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/session/email-login/318d6a5de3968c4ecadecd8af345dedb')

'step 2: Add visual checkpoint at Page_session_email-logind6a5de3968c4ecadecd8af345dedb'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00790_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
