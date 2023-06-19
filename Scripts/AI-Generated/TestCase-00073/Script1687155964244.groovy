import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-use-katalon-testops-agent-to-schedule-and-remotely-execute-a-katalon-studio-project'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-use-katalon-testops-agent-to-schedule-and-remotely-execute-a-katalon-studio-project/45031')

'step 2: Add visual checkpoint at Page_t_how-to-use-katalon-testops-agent-to-schedule-and-remotely-execute-a-katalon-studio-project'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00073_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
