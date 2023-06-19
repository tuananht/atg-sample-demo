import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-java-lang-nullpointerexception-when-using-testdata-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-java-lang-nullpointerexception-when-using-testdata-getvalue/29094/7')

'step 2: Add visual checkpoint at Page_t_getting-java-lang-nullpointerexception-when-using-testdata-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00147_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
