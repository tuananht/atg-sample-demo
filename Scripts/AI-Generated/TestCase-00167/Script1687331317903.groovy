import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_aphroditeradhika_preferences_emails'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/aphroditeradhika/preferences/emails')

'step 2: Add visual checkpoint at Page_u_aphroditeradhika_preferences_emails'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00167_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
