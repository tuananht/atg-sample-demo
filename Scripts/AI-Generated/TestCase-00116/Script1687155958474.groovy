import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_configuring-a-katalon-studio-project-with-a-json-file'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/configuring-a-katalon-studio-project-with-a-json-file/88084')

'step 2: Add visual checkpoint at Page_t_configuring-a-katalon-studio-project-with-a-json-file'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00116_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
